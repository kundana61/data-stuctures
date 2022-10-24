public class Invoice { 
private String PartNo; 
private String desc; 
private int quantity; 
private double price; 
 
void setPartNo(String y) { 
 PartNo = y; 
 } 
 String getPartNo() { 
 return PartNo; 
 } 
void setDesc(String y) { 
 desc = y; 
 } 
 String getDesc() { 
 return desc; 
 } 
void setQuantity(int x) { 
 quantity = x; 
 } 
int getQuantity() { 
 return quantity; 
 } 
void setPrice(double x) { 
 price = x; 
 } 
double getPrice() { 
 return price; 
 } 
double getInvoiceAmount() { 
 return getPrice()*getQuantity(); 
 } 
void PurchaseItem(String x, String y, int t , double d) { 
 setPartNo(x); 
 setDesc(y); 
 setQuantity(t); 
 setPrice(d); 
 } 
}