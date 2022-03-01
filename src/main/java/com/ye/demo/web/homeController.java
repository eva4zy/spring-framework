package com.ye.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ye.demo.domain.User;

// this controller handles all the requests that go to the route url which is home
// 'home' is expected to render index.html and send along with it a model with an empty user object

// through the model, the data we entered gets binded to the user object
// the values are put into the respective fields of the object

// form in index.html is submitted to the 'create' end point using the post method
@Controller
public class homeController {	

	// sending data to the View through the Model
	// getting data from the View through the Model
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("formData", new User()); // a map, add the attribute under the name.
		return "index";	// return the relevant view which is called index.html
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)	// accept the post and user obejct
	public String processFormData(User user, RedirectAttributes attr) {	// an instance of the user object with data populated into it
		attr.addFlashAttribute("user", user);
		return "redirect:/display";
	}
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String displayFormData(User user) {
		return "result";
	}
	
}
