package com.coinomi.core.coins;

/**
 * Created by Kleber on 14/01/2018.
 */
import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

public class MartexcoinMain extends PeerFamily {

    private MartexcoinMain() {
        id = "martex.main";

        addressHeader = 50;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 5;
        dumpedPrivateKeyHeader = 178;

        name = "MarteXcoin";
        symbol = "MXT";
        uriScheme = "martex";
        bip44Index = 130;
        unitExponent = 8;
        feeValue = value(10000); // 0.00001MXT
        minNonDust = value(10000); // 0.00001MXT
        softDustLimit = minNonDust;//value(100000);
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("MarteX Signed Message:\n");
    }

    private static MartexcoinMain instance = new MartexcoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
