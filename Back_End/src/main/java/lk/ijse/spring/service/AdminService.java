package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;

public interface AdminService {
    AdminDTO login(String email, String password);
}
