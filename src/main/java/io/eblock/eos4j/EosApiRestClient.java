package io.eblock.eos4j;

import io.eblock.eos4j.api.vo.*;
import io.eblock.eos4j.api.vo.account.Account;
import io.eblock.eos4j.api.vo.action.Actions;
import io.eblock.eos4j.api.vo.transaction.Transaction;
import io.eblock.eos4j.api.vo.transaction.push.Tx;

import java.util.List;

public interface EosApiRestClient {

    ChainInfo getChainInfo();
    Block getBlock(String blockNumberOrId);
    Account getAccount(String account);
    TableRows getTableRows(TableRowsReq req);
    Transaction pushTransaction(String compression, Tx pushTransaction, String[] signatures) throws Exception;
    Actions getActions(String accountName, Integer pos, Integer offset) throws Exception;
    List<String> getCurrencyBalance(String code, String accountName, String symbol);
    Transaction pushTransaction(String tx) throws Exception;
    SignParam getOfflineSignParams(Long exp);
    Transaction transfer(String pk, String contractAccount, String from, String to, String quantity, String memo) throws Exception;
    Transaction createAccount(String pk, String creator, String newAccount, String owner, String active,Long buyRam) throws Exception;
    Transaction createAccount(String pk, String creator, String newAccount, String owner, String active, Long buyRam, String stakeNetQuantity, String stakeCpuQuantity, Long transfer) throws Exception;
    Transaction voteproducer(String pk,String voter,String proxy,List<String> producers) throws Exception;
    Transaction close(String pk,String contract,String owner, String symbol) throws Exception;

}
