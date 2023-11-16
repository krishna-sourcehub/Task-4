package com.example.userRegisteration;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userinfo")
public class UserDetails {
    @Id
    private String id;
    private String username;
    private String from;
    private String to;
    private String date;
    private String time;
    private String mobile;
    private String mail;
    private String description;
    private String type;
    private String sendermail;
    private String receivermail;
    private String senderaccount;
    private String receiveraccount;
    private String senderAadhar;
    private String receiverAadhar;
    private String senderPhoneNumber;
    private String receiverPhoneNumber;
    private String senderUpi;
    private String receiverUpi;
    private String transactionid;
    private String wallet;
    private String city;
    private String country;
    private String amount;
    private String status;
    
    
    
   
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	
	public String getSenderUpi() {
		return senderUpi;
	}
	public void setSenderUpi(String senderUpi) {
		this.senderUpi = senderUpi;
	}
	public String getReceiverUpi() {
		return receiverUpi;
	}
	public void setReceiverUpi(String receiverUpi) {
		this.receiverUpi = receiverUpi;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSenderPhoneNumber() {
		return senderPhoneNumber;
	}
	public void setSenderPhoneNumber(String senderPhoneNumber) {
		this.senderPhoneNumber = senderPhoneNumber;
	}
	public String getReceiverPhoneNumber() {
		return receiverPhoneNumber;
	}
	public void setReceiverPhoneNumber(String receiverPhoneNumber) {
		this.receiverPhoneNumber = receiverPhoneNumber;
	}
	public String getSenderaccount() {
		return senderaccount;
	}
	public void setSenderaccount(String senderaccount) {
		this.senderaccount = senderaccount;
	}
	public String getReceiveraccount() {
		return receiveraccount;
	}
	public void setReceiveraccount(String receiveraccount) {
		this.receiveraccount = receiveraccount;
	}
	public String getSenderAadhar() {
		return senderAadhar;
	}
	public void setSenderAadhar(String senderAadhar) {
		this.senderAadhar = senderAadhar;
	}
	public String getReceiverAadhar() {
		return receiverAadhar;
	}
	public void setReceiverAadhar(String receiverAadhar) {
		this.receiverAadhar = receiverAadhar;
	}
	public String getSendermail() {
		return sendermail;
	}
	public void setSendermail(String sendermail) {
		this.sendermail = sendermail;
	}
	public String getReceivermail() {
		return receivermail;
	}
	public void setReceivermail(String receivermail) {
		this.receivermail = receivermail;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public UserDetails() {
	
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", username=" + username + ", from=" + from + ", to=" + to + ", date=" + date
				+ ", time=" + time + ", mobile=" + mobile + ", mail=" + mail + ", description=" + description
				+ ", type=" + type + ", sendermail=" + sendermail + ", receivermail=" + receivermail
				+ ", senderaccount=" + senderaccount + ", receiveraccount=" + receiveraccount + ", senderAadhar="
				+ senderAadhar + ", receiverAadhar=" + receiverAadhar + ", senderPhoneNumber=" + senderPhoneNumber
				+ ", receiverPhoneNumber=" + receiverPhoneNumber + ", senderUpi=" + senderUpi + ", receiverUpi="
				+ receiverUpi + ", transactionid=" + transactionid + ", wallet=" + wallet + ", city=" + city
				+ ", country=" + country + ", amount=" + amount + ", status=" + status + "]";
	}
	
	
	
}
