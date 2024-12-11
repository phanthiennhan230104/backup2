package com.myRestaurant.manager.Dto;

import java.math.BigDecimal;

import com.myRestaurant.manager.Entities.TableEntities;
import com.myRestaurant.manager.Entities.UserEntities;

public class InvoiceDto {
    private int invoiceId;
    private int userId;  // Chỉ lưu userId thay vì đối tượng UserEntities
    private String tableId;  // Chỉ lưu tableId thay vì đối tượng TableEntities
    private BigDecimal sum;
    private long point;

    // Getters and Setters
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal bigDecimal) {
        this.sum = bigDecimal;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }
}
