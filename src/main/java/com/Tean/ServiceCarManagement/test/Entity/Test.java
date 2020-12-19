package com.Tean.ServiceCarManagement.test.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Test
{
    @Id // necessary
    // Khi e khai báo với annotation @Entity thì Spring tự động mapping lớp này với một bnagr trong DB
    // nếu dùng DB quan hệ thì bảng phải có id nên entity cũng phỉa khai báo đâu là cột id để Spring biết đường
    // mà mapping
    @Column(name = "ditmehieucu")
    private String Ditmehieucu;
}
