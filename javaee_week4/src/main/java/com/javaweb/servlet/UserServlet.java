package com.javaweb.servlet;

import com.javaweb.dao.entity.User;
import com.javaweb.dao.impl.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * servlet3.0 下的servlet实现
 */

public class UserServlet extends HttpServlet {



        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            String type = req.getParameter("type");
            if(type == null || type == ""){
                PrintWriter pw = resp.getWriter();
                pw.print("type not sure");
                pw.flush();
                pw.close();
            }else{
                if(type.equalsIgnoreCase("查")){
                    UserDao userDao = new UserDao();
                    userDao.init();
                    List<User> ob = userDao.selectall();
                    StringBuffer sb = new StringBuffer();
                    for (User user : ob){
                        sb.append("id:" + user.getId() + ",name:" + user.getName() +  ":" + ",sex is:" + user.getSex()).append("\n");
                    }
                    PrintWriter pw = resp.getWriter();
                    pw.print(sb.toString());
                    pw.flush();
                    pw.close();
                }
                if(type.equalsIgnoreCase("删")){
                    String id = req.getParameter("id");
                    UserDao userDao = new UserDao();
                    userDao.init();
                    Integer result = userDao.delete(Integer.parseInt(id));
                    PrintWriter pw = resp.getWriter();
                    pw.print("susscess delete id : " + id + " data,refresh and check");
                    pw.flush();
                    pw.close();
                }if(type.equalsIgnoreCase("增")){
                    String name = req.getParameter("name");
                    String sex = req.getParameter("sex");
                    User user = new User(name,sex);
                    UserDao userDao = new UserDao();
                    userDao.init();
                    Integer result = userDao.add(user);
                    PrintWriter pw = resp.getWriter();
                    pw.print("susscess add user data,refresh and check");
                    pw.flush();
                    pw.close();
                }
                if(type.equalsIgnoreCase("改")){
                    String id = req.getParameter("id");
                    if(id == null || id == ""){
                        PrintWriter pw = resp.getWriter();
                        pw.print("please enter id number");
                        pw.flush();
                        pw.close();
                    }else{
                        Integer number = Integer.parseInt(id);
                        String name = req.getParameter("name");
                        String sex = req.getParameter("sex");
                        User user = new User(number,name,sex);
                        UserDao userDao = new UserDao();
                        userDao.init();
                        Integer result = userDao.update(user);
                        PrintWriter pw = resp.getWriter();
                        pw.print("susscess update user data,refresh and check");
                        pw.flush();
                        pw.close();
                    }

                }

            }






        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            // TODO Auto-generated method stub
            this.doGet(req, resp);
        }

}
