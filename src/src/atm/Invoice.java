package atm;

import java.time.LocalDate;

public class Invoice {
    private LocalDate invoiceDate;
    private String description;
    private String amount;

    public Invoice(LocalDate invoiceDate, String description, String amount) {
        this.invoiceDate = invoiceDate;
        this.description = description;
        this.amount = amount;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
