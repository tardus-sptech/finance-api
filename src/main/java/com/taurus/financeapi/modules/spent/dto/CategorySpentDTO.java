package com.taurus.financeapi.modules.spent.dto;

public class CategorySpentDTO {
    private String description;
    private Double totalValue;

    public CategorySpentDTO(String description, Double totalValue) {
        this.description = description;
        this.totalValue = totalValue;
    }

    // Getters e Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
