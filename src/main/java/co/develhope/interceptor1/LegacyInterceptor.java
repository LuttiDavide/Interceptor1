package co.develhope.interceptor1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
import java.io.PrintWriter;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        response.setStatus(HttpServletResponse.SC_GONE);
        PrintWriter out = response.getWriter();
        out.print("This endpoint is deprecated and no longer supported.");
        out.flush();
        return false;
    }

}
