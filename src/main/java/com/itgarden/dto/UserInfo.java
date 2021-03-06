package com.itgarden.dto;

import com.itgarden.common.staticdata.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;


@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo extends BaseInfo {


    private String emailId;

    private String password;

    private String rePassword;

    private String firstName;

    private String middleName;

    private String lastName;

    private String mobileNo;

    private List<AddressInfo> addressList;

    private List<RoleInfo> roles;

    private EmployeeInfo employee;

    private String userType;

}
