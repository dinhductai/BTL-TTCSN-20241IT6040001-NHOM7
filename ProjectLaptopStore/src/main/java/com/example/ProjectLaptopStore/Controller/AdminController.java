package com.example.ProjectLaptopStore.Controller;

import com.example.ProjectLaptopStore.DTO.*;
import com.example.ProjectLaptopStore.Service.ICustomerService;
import com.example.ProjectLaptopStore.Service.IOrderService;
import com.example.ProjectLaptopStore.Service.IProductService;
import com.example.ProjectLaptopStore.Service.ISuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AdminController {
//    @PersistenceContext
//    private EntityManager entityManager;

    @Autowired
    private IProductService productService;

    @Autowired
    private IOrderService orderService;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ISuppliersService suppliersService;

    //test
    @GetMapping(value = "/api/product/")
    public List<ProductDTO> ShowProduct(){
        List<ProductDTO> result = productService.findAllProducts();
        return result;
    }
    //test
    @GetMapping(value = "/api/product/{productName}/{brand}")
    public List<ProductDTO> SearchProductByNameAndBrand(@PathVariable String productName, @PathVariable String brand){
        List<ProductDTO> result = productService.findByNameContainingAndBrandContainingAtService(productName,brand);
        return result;
    }
    //test
    @GetMapping(value = "/api/search/{productName}/{supplierName}")
    public List<ProductAndSupplierDTO> SearchProductByNameProductAndNameSupplier(@PathVariable String productName, @PathVariable String supplierName){
        List<ProductAndSupplierDTO> result = productService.findByProductNameAndSupplier_SupplierNameAtService(productName,supplierName);
        return result;
    }

    //API lấy tổng tiền trong tháng hiện tại
    @GetMapping(value = "/admin/totalmount/")
    public Order_TotalAmountInMonthDTO TotalAmountInMount(){
        Order_TotalAmountInMonthDTO res = orderService.getTotalAmountInMountAtService();
        return res;
    }


    //API lấy tổng khách hàng trong tháng hiện tại
    @GetMapping(value = "/admin/totalcustomer/")
    public Integer TotalCustomerInMonth(){
        Integer result = orderService.TotalCustomerInMonthAtService();
        return result;
    }

    //API lấy số khách hàng mới trong thời điểm nhất định
    @GetMapping(value = "/admin/countcustomer/")
    public Integer CountNewCustomer(@RequestParam Map<String,Object> params){
        Integer result = customerService.countCustomers(params);
        return result;
    }
    //API lấy top sản phẩm
    @GetMapping(value = "/admin/topproduct/")
    public List<Product_FindTopPurchasedProductsDTO> TopProduct(){
        List<Product_FindTopPurchasedProductsDTO> result = productService.findTopPurchasedProductAtService();
        return result;
    }

    //API lấy top nhà cung cấp
    @GetMapping(value = "/admin/topsuppliers/")
    public List<SuppliersDTO> TopSuppliers(){
        List<SuppliersDTO> result = suppliersService.listTopSupplier();
        return result;
    }

    //API lấy danh sách bill
    @GetMapping(value = "/admin/listbill/")
    public List<Order_ListBillDTO> ListBill(){
        List<Order_ListBillDTO> result = orderService.ListBillAtService();
        return result;
    }

    //API lấy danh sách invoice chi tiết
    @GetMapping(value = "/admin/list_invoicedetail/")
    public List<Order_InvoiceDetailDTO> ListInvoice(){
        List<Order_InvoiceDetailDTO> result = orderService.ListInvoiceDetailAtService();
        return result;
    }

}
