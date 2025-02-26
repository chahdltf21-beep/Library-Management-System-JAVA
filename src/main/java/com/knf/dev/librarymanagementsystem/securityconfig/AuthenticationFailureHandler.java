package com.knf.dev.librarymanagementsystem.securityconfig;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : librarymanagementsystem
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 26/02/25
 * Time: 10.19
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class AuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException {
        String errorMessage = "failed login attempt. invalid username or password";
        log.error(errorMessage);
        if (exception.getMessage().equalsIgnoreCase("blocked")) {
            errorMessage = "you have been blocked for 3 unsuccessful login attempt";
            log.error(errorMessage);
        }
        log.info("path {}", request.getPathInfo());
        response.sendRedirect(request.getPathInfo());
    }

}
