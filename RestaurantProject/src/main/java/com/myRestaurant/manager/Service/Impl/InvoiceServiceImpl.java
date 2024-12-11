package com.myRestaurant.manager.Service.Impl;

import java.util.List;

import com.myRestaurant.manager.Dto.InvoiceDto;

public interface InvoiceServiceImpl {
	List<InvoiceDto> getAllInvoices();
	List<InvoiceDto> searchInvoicesByTableId(String tableId);
}
