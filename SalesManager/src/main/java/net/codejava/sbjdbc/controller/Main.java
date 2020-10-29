package net.codejava.sbjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.sbjdbc.dao.SalesDAO;
import net.codejava.sbjdbc.model.Sale;
@Controller
public class Main {
	@Autowired
	private SalesDAO dao;
	//hiển thị danh sách sale
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String HomePage(Model model) {
		List<Sale> listsale=dao.list();
		model.addAttribute("list",listsale);
		return "home";
	}
	//hiển thị form thêm mới
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String formthemmoi(Model model) {
		Sale sale=new Sale();
		model.addAttribute("sale", sale);
		return "new_form";
	}
	//hàm thực hiện nút lưu thông tin vào DB
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("sale") Sale sale) {
		 dao.save(sale);
		 return "redirect:/";
	}
	//hàm hiển thì form edit
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    Sale sale = dao.get(id);
	    mav.addObject("sale", sale);
	 
	    return mav;
	}
	//hàm thực hiện nút update từ form edit
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute("sale") Sale sale) {
		dao.update(sale);
		return "redirect:/";
	}
	//hàm thực hiện xóa theo id
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") int id) {
	    dao.delete(id);
	    return "redirect:/";      
	}

}
