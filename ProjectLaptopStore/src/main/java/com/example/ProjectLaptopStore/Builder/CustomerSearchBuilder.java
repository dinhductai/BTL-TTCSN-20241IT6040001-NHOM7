package com.example.ProjectLaptopStore.Builder;

import java.util.Date;
//lớp này là lớp đại diện yêu cầu tìm kiếm từ giao diện
//có thể mở rộng thêm
public class CustomerSearchBuilder {
    private Date dateRegisterFrom;
    private Date dateRegisterTo;
    public CustomerSearchBuilder(Builder builder){
        this.dateRegisterFrom = builder.dateRegisterFrom;
        this.dateRegisterTo = builder.dateRegisterTo;
    }

    public Date getDateRegisterFrom() {
        return dateRegisterFrom;
    }

    public Date getDateRegisterTo() {
        return dateRegisterTo;
    }

    public static class Builder{
        private Date dateRegisterFrom;
        private Date dateRegisterTo;

        public Builder setDateRegisterFrom(Date dateRegisterFrom) {
            this.dateRegisterFrom = dateRegisterFrom;
            return this;
        }

        public Builder setDateRegisterTo(Date dateRegisterTo) {
            this.dateRegisterTo = dateRegisterTo;
            return this;
        }
        public CustomerSearchBuilder build(){
            return new CustomerSearchBuilder(this);
        }
    }


}
