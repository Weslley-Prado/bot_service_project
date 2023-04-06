package com.shopseg.bot_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sh_botconfiguracao")
public class BotConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column
    private String bot;
	@Column
    private String token;
	@Column (name= "vencimentoprazos")
    private String dueData;
	@Column (name= "vencimentoextras")
    private String overtime;
	@Column (name = "tolerancianotafiscalcusto")
    private Double costInvoiceTolerance;
	@Column (name = "tolerancianotafiscalquantidade")
    private Double invoiceToleranceQuantity;
	@Column (name ="botativado")
    private Boolean botActivited;
	
	public BotConfig() {
		super();
	}

	public BotConfig(Integer id, String bot, String token, String dueData, String overtime, Double costInvoiceTolerance,
			Double invoiceToleranceQuantity, Boolean botActivited) {
		super();
		this.id = id;
		this.bot = bot;
		this.token = token;
		this.dueData = dueData;
		this.overtime = overtime;
		this.costInvoiceTolerance = costInvoiceTolerance;
		this.invoiceToleranceQuantity = invoiceToleranceQuantity;
		this.botActivited = botActivited;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBot() {
		return bot;
	}

	public void setBot(String bot) {
		this.bot = bot;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDueData() {
		return dueData;
	}

	public void setDueData(String dueData) {
		this.dueData = dueData;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public Double getCostInvoiceTolerance() {
		return costInvoiceTolerance;
	}

	public void setCostInvoiceTolerance(Double costInvoiceTolerance) {
		this.costInvoiceTolerance = costInvoiceTolerance;
	}

	public Double getInvoiceToleranceQuantity() {
		return invoiceToleranceQuantity;
	}

	public void setInvoiceToleranceQuantity(Double invoiceToleranceQuantity) {
		this.invoiceToleranceQuantity = invoiceToleranceQuantity;
	}

	public Boolean getBotActivited() {
		return botActivited;
	}

	public void setBotActivited(Boolean botActivited) {
		this.botActivited = botActivited;
	}

	@Override
	public String toString() {
		return "BotConfig [id=" + id + ", bot=" + bot + ", token=" + token + ", dueData=" + dueData + ", overtime="
				+ overtime + ", costInvoiceTolerance=" + costInvoiceTolerance + ", invoiceToleranceQuantity="
				+ invoiceToleranceQuantity + ", botActivited=" + botActivited + "]";
	}

	
}




