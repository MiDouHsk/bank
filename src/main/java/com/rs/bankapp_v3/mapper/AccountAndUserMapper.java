package com.rs.bankapp_v3.mapper;

import com.rs.bankapp_v3.models.dto.AccountDto;
import com.rs.bankapp_v3.models.dto.UserDto;
import com.rs.bankapp_v3.models.entity.Account;
import com.rs.bankapp_v3.models.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountAndUserMapper {

    @Autowired
    private ModelMapper modelMapper;

    public UserDto convertToDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public AccountDto convertToDto(Account account) {
        return modelMapper.map(account, AccountDto.class);
    }

    public User convertToEntity(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    public Account convertToEntity(AccountDto accountDto) {
        return modelMapper.map(accountDto, Account.class);
    }
}
