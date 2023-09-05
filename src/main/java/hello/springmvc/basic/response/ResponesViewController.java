package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponesViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1 () {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data","hello");

        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2 (Model model) {
        model.addAttribute("data","hello!");
        return "response/hello";
    }

    /**
     * 요청 경로와 뷰 경로를 맞추면
     * return을 안해줘도된다.
     * - 권장 X, V2버전으로 사용하는 것이 좋다!
     */
    @RequestMapping("/response/heloo")
    public void responseViewV3 (Model model) {
        model.addAttribute("data","hello!");
    }
}
