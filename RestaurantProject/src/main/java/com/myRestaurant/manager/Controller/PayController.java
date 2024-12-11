package com.myRestaurant.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myRestaurant.manager.Dto.InvoiceDto;
import com.myRestaurant.manager.Dto.UserDto;
import com.myRestaurant.manager.Service.InvoiceService;

@CrossOrigin("*")
@RestController
@RequestMapping("/homepage-cashier")
public class PayController {
	@Autowired
    private InvoiceService invoiceService;

	@GetMapping("/pay/list-invoice")
	public List<InvoiceDto> getInvoices() {
        return invoiceService.getAllInvoices();
    }
    @GetMapping("/pay/search-invoice")
    public List<InvoiceDto> searchInvoices(@RequestParam String tableId) {
        return invoiceService.searchInvoicesByTableId(tableId);
    }
}
