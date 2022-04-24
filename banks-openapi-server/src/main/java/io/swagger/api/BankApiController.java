package io.swagger.api;

import io.swagger.model.Client;
import org.threeten.bp.LocalDate;
import io.swagger.model.ResponseWrapperBank;
import io.swagger.model.ResponseWrapperClientWrapper;
import io.swagger.model.ResponseWrapperDepositAccount;
import io.swagger.model.ResponseWrapperListBaseAccount;
import io.swagger.model.ResponseWrapperListClient;
import io.swagger.model.ResponseWrapperListTransaction;
import io.swagger.model.ResponseWrapperTransaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-24T10:52:51.878Z[GMT]")
@RestController
public class BankApiController implements BankApi {

    private static final Logger log = LoggerFactory.getLogger(BankApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BankApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseWrapperClientWrapper> addClient(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("bankId") Long bankId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "first_name", required = true) String firstName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "second_name", required = true) String secondName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperClientWrapper>(objectMapper.readValue("{\n  \"client\" : {\n    \"firstName\" : \"firstName\",\n    \"bankId\" : 0,\n    \"passportData\" : \"passportData\",\n    \"address\" : \"address\",\n    \"accountIds\" : [ 6, 6 ],\n    \"secondName\" : \"secondName\"\n  }\n}", ResponseWrapperClientWrapper.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperClientWrapper>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperClientWrapper>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperBank> createBank(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "debit_percentage", required = true) Double debitPercentage,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "credit_commission", required = true) Double creditCommission,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "unverified_amount_limit", required = true) Long unverifiedAmountLimit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperBank>(objectMapper.readValue("{\n  \"unverifiedTransactionAmountLimit\" : 5,\n  \"debitPercentage\" : 6.027456183070403,\n  \"creditCommission\" : 1.4658129805029452,\n  \"id\" : 0\n}", ResponseWrapperBank.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperBank>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperBank>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperDepositAccount> createDeposit(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("clientId") Long clientId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "up_to_date", required = true) LocalDate upToDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperDepositAccount>(objectMapper.readValue("{\n  \"bankId\" : 6,\n  \"upToDate\" : \"2000-01-23\",\n  \"accumulatedAmount\" : 2,\n  \"balancePercentage\" : 5.637376656633329,\n  \"currentAmount\" : 5,\n  \"id\" : 0,\n  \"ownerId\" : 1,\n  \"type\" : \"CREDIT\"\n}", ResponseWrapperDepositAccount.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperDepositAccount>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperDepositAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperClientWrapper> editClient(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("clientId") Long clientId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Client body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperClientWrapper>(objectMapper.readValue("{\n  \"client\" : {\n    \"firstName\" : \"firstName\",\n    \"bankId\" : 0,\n    \"passportData\" : \"passportData\",\n    \"address\" : \"address\",\n    \"accountIds\" : [ 6, 6 ],\n    \"secondName\" : \"secondName\"\n  }\n}", ResponseWrapperClientWrapper.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperClientWrapper>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperClientWrapper>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperListTransaction> getAllTransactionsByCreatorId(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "creator_client_id", required = true) Long creatorClientId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperListTransaction>(objectMapper.readValue("{ }", ResponseWrapperListTransaction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperListTransaction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperListTransaction>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperListBaseAccount> getBankAccounts(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("bankId") Long bankId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperListBaseAccount>(objectMapper.readValue("{ }", ResponseWrapperListBaseAccount.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperListBaseAccount>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperListBaseAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperListClient> getBankClients(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("bankId") Long bankId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperListClient>(objectMapper.readValue("{ }", ResponseWrapperListClient.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperListClient>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperListClient>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperClientWrapper> getClient(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("clientId") Long clientId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperClientWrapper>(objectMapper.readValue("{\n  \"client\" : {\n    \"firstName\" : \"firstName\",\n    \"bankId\" : 0,\n    \"passportData\" : \"passportData\",\n    \"address\" : \"address\",\n    \"accountIds\" : [ 6, 6 ],\n    \"secondName\" : \"secondName\"\n  }\n}", ResponseWrapperClientWrapper.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperClientWrapper>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperClientWrapper>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseWrapperTransaction> transfer(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("clientId") Long clientId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "source_account_id", required = true) Long sourceAccountId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "target_account_id", required = true) Long targetAccountId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema(allowableValues={ "RUB", "USD", "EUR" }
)) @Valid @RequestParam(value = "currency", required = true) String currency,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Long amount) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseWrapperTransaction>(objectMapper.readValue("{\n  \"sourceAccountId\" : 6,\n  \"targetAccountId\" : 1,\n  \"amount\" : 5,\n  \"creatorClientId\" : 0,\n  \"completionTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"currency\" : \"RUB\",\n  \"message\" : \"message\",\n  \"status\" : \"NEW\"\n}", ResponseWrapperTransaction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseWrapperTransaction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseWrapperTransaction>(HttpStatus.NOT_IMPLEMENTED);
    }

}
