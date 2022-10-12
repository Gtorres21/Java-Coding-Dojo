@Controller
public class MainController {

	
	public final UserService userServ;
	public MainController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/")
	public String loginRedirect() {
		return "redirect:/user/login/register";
	}
	
	
	@GetMapping("/dashboard")
	public String loginRegisterUser(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect/";
		}
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "main/dashboard.jsp";
	}
	
	
	

}
