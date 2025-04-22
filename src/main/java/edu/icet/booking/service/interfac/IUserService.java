package edu.icet.booking.service.interfac;


import edu.icet.booking.dto.LoginRequest;
import edu.icet.booking.dto.Response;
import edu.icet.booking.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
