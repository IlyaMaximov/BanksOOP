package edu.phystech.account;

import java.time.LocalDate;

import edu.phystech.response.ResponseWrapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public record AccountController(AccountService service) {
    @RequestMapping(value = "/accounts/deposit/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper<BaseAccount> createDeposit(
            @RequestParam(value = "owner_id") long ownerId,
            @RequestParam(value = "up_to_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate upToDate
    ) {
        return new ResponseWrapper<>(service.createDepositAccount(ownerId, upToDate));
    }
}
