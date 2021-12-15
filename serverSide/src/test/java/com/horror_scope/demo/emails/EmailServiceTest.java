package com.horror_scope.demo.emails;

import com.horror_scope.demo.exception.Exceptions;
import com.horror_scope.demo.horrorscope.HorrorScopeDAO;
import com.horror_scope.demo.horrorscope.HorrorScopeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmailServiceTest {

    private EmailDAO emailDAO;
    private EmailService underTest;

    @BeforeEach
    void setUp() {

        emailDAO = mock(EmailDAO.class);
        underTest = new EmailService(emailDAO);
    }

    @Test
    void shouldReturnTrue() {
        //given
        String email = "email@email.com";
        //when
        //then
        assertThat(underTest.isValid(email)).isEqualTo(true);
    }

    @Test
    void shouldReturnFalse() {
        String email = "not an email";

    assertThat(underTest.isValid(email)).isEqualTo(false);

//        assertThatThrownBy(() -> underTest.isValid(email))
//            .isInstanceOf(Exceptions.class)
//                .hasMessageContaining("Email is not valid");
    }

    @Test
    void shouldGetEmail() {
        Email email = new Email(1,"email@email.com", "Virgo", "haj", "rahman");

        List<Email> eList = List.of(email);
        when(emailDAO.selectEmailByEmail("email@email.com")).thenReturn(Optional.ofNullable(eList.get(0)));

        Optional<Email> actual = underTest.getEmail("email@email.com");

        assertThat(actual).isEqualTo(Optional.of(eList.get(0)));
    }


    @Test
    void addEmail() {
        Email email = new Email(1,"email@email.com", "Virgo", "Bob", "b");

        List<Email> eList = List.of(email);
        when(emailDAO.insertEmail("example@email.com","pisces")).thenReturn(1);

//         int actual = underTest.addEmail("example@email.com","pisces");
        int actual = underTest.addEmail("example@email.com","pisces", "bob", "b");

         assertEquals(1, actual);
    }


    @Test
    void shouldProduceErrorTryingToAddInvalidEmail() {
        Email email = new Email(1, "John", "Pisces", "bob", "b");
        List<Email> eList = List.of(email);

        when(emailDAO.insertEmail("john", "Pisces")).thenReturn(1);

        assertThatThrownBy(() -> underTest.addEmail("john", "Pisces", "bob", "b"))
            .isInstanceOf(Exceptions.class)
                .hasMessageContaining("Email is not valid");
    }

    @Test
    void deleteEmail() {

       //given
        Email email = new Email(1,"email@email.com", "Virgo", "Bob", "b");
        emailDAO.selectEmailByEmail("email@email.com");
        List<Email> eList = List.of(email);


        //when
        when(emailDAO.selectEmailByEmail("email@email.com")).thenReturn(Optional.of(email));
        when(emailDAO.deleteEmail("email@email.com")).thenReturn(1);

        assertThat(eList.get(0)).isNotNull();

        assertThat(underTest.deleteEmail("email@email.com")).isEqualTo(1);
    }

    @Test
    void shouldThrowErrorIfEmailDoesNotExist(){
        Email email = new Email(1,"email@email.com", "Virgo", "bob", "b");

        List<Email> eList = List.of(email);

        when(emailDAO.deleteEmail("example@email.com")).thenReturn(-1);

        assertThatThrownBy(() -> underTest.deleteEmail("example@email.com"))
                .isInstanceOf(Exceptions.class)
                .hasMessageContaining("Email not found");
    }
}