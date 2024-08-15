package campusvirtual.controller.inicio;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/inicio")
public class InicioController {

    private boolean logged = false;

    @GetMapping("")
    public ModelAndView inicio(Model model) {
        ModelAndView mv = new ModelAndView("index");
        String user = (String) model.asMap().get("user");
        if (user != null) {
            logged = true;
            mv.addObject("user", user);
            return mv;
        }
        MDC.put("logged", "n");
        mv.setViewName("redirect:/login");
        return mv;
    }

    @GetMapping("/detalles")
    public ModelAndView noEncontrado() {
        if (!logged) {
            return new ModelAndView("redirect:/login");
        }
        return new ModelAndView("404-NotFound");
    }

    @GetMapping("/acercade")
    public ModelAndView acercaDe() {
        return this.noEncontrado();
    }

    @GetMapping("/carreras")
    public ModelAndView carreras() {
        return this.noEncontrado();
    }

    @GetMapping("/usuario")
    public ModelAndView usuario() {
        return this.noEncontrado();
    }

    @GetMapping("/facultades")
    public ModelAndView facultades() {
        return this.noEncontrado();
    }

    @GetMapping("/investigacion")
    public ModelAndView investigacion() {
        return this.noEncontrado();
    }

    @GetMapping("/admisiones")
    public ModelAndView admisiones() {
        return this.noEncontrado();
    }

}
