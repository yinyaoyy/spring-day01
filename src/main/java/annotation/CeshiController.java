package annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CeshiController {

    @RequestMapping(value = "/ceshi/type",method = RequestMethod.GET)
    public String getPage(HttpServletRequest request, Model model){
        String a = request.getParameter("type");
        model.addAttribute("type",a);
        return "ceshi";
    }
}
