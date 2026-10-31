package com.jason.repairapp.web;

public record OrderSummary(String customerName,
                           String phoneModel,
                           String status,
                           boolean overdue) {
}
