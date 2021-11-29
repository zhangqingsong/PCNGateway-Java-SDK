package com.bsnbase.sdk.entity.resp.fabric;

import com.bsnbase.sdk.entity.base.IBody;
import lombok.Data;

/**
 * Response parameters of get block data interface
 */

@Data
public class ResGetBlockData implements IBody {
    /**
     * Block hash
     * Note: cannot be null when blockNumber is null
     */
    String blockHash;
    /**
     * Block number
     * Note: cannot be null when blockHash is null
     */
    Long blockNumber;
    /**
     * Previous block hash
     */
    String preBlockHash;
    /**
     * Block data
     * Note: String generated by base64 calculation
     */
    String blockData;

    @Override
    public String getEncryptionValue() {
        return (this.blockHash == null ? "" : this.blockHash)
                + (this.blockNumber == null ? "" : this.blockNumber)
                + (this.preBlockHash == null ? "" : this.preBlockHash)
                + (this.blockData == null ? "" : this.blockData);
    }
}