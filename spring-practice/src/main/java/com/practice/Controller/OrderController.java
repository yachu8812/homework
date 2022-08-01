package com.practice.Controller;


import com.practice.Model.Order;
import com.practice.Model.Turnover;
import com.practice.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService OrderService;


    @GetMapping("/{seq}")
    public String getOrderBySeq(@PathVariable int seq, Model model){
        Order order = this.OrderService.getOrderByseq(seq);
        model.addAttribute("order",order);
        return "order";
    }

    //今日營業額
    @GetMapping("/Total")
    public String getTurnoverByTotalPrice(Model model){
        Turnover Total = this.OrderService.getTurnoverByTotalPrice();
        model.addAttribute("Total", Total);
        return "Total";
    }


}
