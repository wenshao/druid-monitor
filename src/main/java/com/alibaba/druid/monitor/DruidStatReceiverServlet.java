package com.alibaba.druid.monitor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @author sandzhang<sandzhangtoo@gmail.com>
 */
public class DruidStatReceiverServlet extends HttpServlet {

    private final static Logger LOG              = Logger.getLogger(DruidStatReceiverServlet.class);
    private static final long   serialVersionUID = 1L;

    public void init() throws ServletException {

    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.error("==================");
        LOG.error(request.getParameter("data"));
        LOG.error("==================");
    }
}
