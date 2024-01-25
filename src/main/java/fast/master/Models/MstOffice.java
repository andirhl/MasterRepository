package fast.master.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "FS_MST_OFFICES")

public class MstOffice {
	@Id
	@Column (name="FMO_OFFICE_CODE", length=5, nullable = false)
	private String FmOofCode;
	
	@Column (name="FMO_NAME_SHORT", length=50)
	private String FmOofNameShort;
	
	@Column (name="FMO_NAME_FULL", length=100)
	private String FmOofNameFull;
	
	@Column (name="FMO_REGIONAL_ID", length=5)
	private String FmOofRegId;
	
	@Column (name="FMO_OFFICE_CODE_REP", length=5)
	private String FmOofCodeRep;
	
	@Column (name="FMO_OFFICE_TYPE", length=3)
	private String FmOofType;
	
	@Column (name="FMO_COLL_INCENTIVE", length=16)
	private BigInteger FmOofCollInc;
	
	@Column (name="FMO_POSITION_CODE", length=5)
	private String FmOofPosCode;
	
	@Column (name="FMO_ADDRESS1", length=50)
	private String FmOofAddr1;
	
	@Column (name="FMO_ADDRESS2", length=50)
	private String FmOofAddr2;
	
	@Column (name="FMO_ADDRESS3", length=50)
	private String FmOofAddr3;
	
	@Column (name="FMO_CITY", length=100)
	private String FmOofCity;
	
	@Column (name="FMO_LOCATION", length=50)
	private String FmOofLocation;
	
	@Column (name="FMO_PHONE1", length=50)
	private String FmOofPhone1;
	
	@Column (name="FMO_PHONE2", length=50)
	private String FmOofPhone2;
	
	@Column (name="FMO_PHONE3", length=50)
	private String FmOofPhone3;
	
	@Column (name="FMO_BPKB_PRC_TIME", length=3)
	private Integer FmOofBpkbPrcTime;
    
	@Column (name="FMO_OFFICE_CLASSCODE", length=7)
	private String FmOofClassCode;
	
	@Column (name="FMO_DIFF_TIME", length=2)
	private Integer FmOofDiffTime;
	
	@Column (name="FMO_VALID_PO_DAYS", length=3)
	private Integer FmOofValidPODays;
	
	@Column (name="FMO_REGION_AR_CODE", length=5)
	private String FmOofRegArCode;
	
	@Column (name="FMO_OFFICE_CATEGORY", length=3)
	private String FmOofCategory;
	
	@Column (name="FMO_PIC_FIRST_NAME", length=50)
	private String FmOofPicFirstName;
	
	@Column (name="FMO_PIC_LAST_NAME", length=50)
	private String FmOofPicLastName;
	
	@Column (name="FMO_PIC_ADDR1", length=50)
	private String FmOofPicAddr1;
	
	@Column (name="FMO_PIC_ADDR2", length=50)
	private String FmOofPicAddr2;
	
	@Column (name="FMO_PIC_ADDR3", length=50)
	private String FmOofPicAddr3;
	
	@Column (name="FMO_PIC_CITY", length=50)
	private String FmOofPicCity;
	
	@Column (name="FMO_PIC_PHONE1", length=50)
	private String FmOofPicPhone1;
	
	@Column (name="FMO_PIC_PHONE2", length=50)
	private String FmOofPicPhone2;
	
	@Column (name="FMO_PIC_PHONE3", length=50)
	private String FmOofPicPhone3;
	
	@Column (name="FMO_STATUS_FLAG", length=1)
	private String FmOofStatusFlag;
	
	@Column (name="FMO_BRANCH_CODE", length=5)
	private String FmOofBranchCode;
	
	@Column (name="FMO_PROCESS_GROUP", length=3)
	private Integer FmOofProcessGrp;
	
	@Column (name="FMO_REGIONAL_ID_INSC", length=5)
	private String FmOofRegIdInsc;

	@Column (name="FMO_PROFIT_DEALER_FLAT_AMT")
	private Integer FmOofPrfDealFlatAmt;

	@Column (name="FMO_PROFIT_DEALER_BY_GRADE", length=1)
	private String FmOofPrfDealByGrp;
	
	@Column (name="FMO_PROFIT_DEALER_PCT")
	private Integer FmOofPrfDealPct;
	
	@Column (name="FMO_ACCS_PRICE_DEV_PCT")
	private Integer FmOofAccsPriceDevPct;
	
	@Column (name="FMO_STARTED_TIMESTAMP")
	private Date FmOofStartedDate;
	
	@Column (name="FMO_CREATED_BY", length=15)
	private String FmOofCreateBY;
	
	@Column (name="FMO_CREATED_TIMESTAMP")
	private Date FmOofCreatedTimestamp;
	
	@Column (name="FMO_LASTUPDATE_BY")
	private String FmOofLastUpdateDate;
	
	@Column (name="FMO_LASTUPDATE_TIMESTAMP", length=15)
	private Date FmOofLastupdateTimestamp;
	
	@Column (name="FMO_REGIONAL_OPR", length=5)
	private String FmOofRegOpr;
	
	@Column (name="FMO_OFFICE_MIN_DP")
	private Integer FmOofMinDp;
	
	@Column (name="FMO_NIAGA_CODE_DATI_II", length=5)
	private String FmOofNiagaCodeDatII;
	
	@Column (name="FMO_KODE_PLAT", length=3)
	private String FmOofKodePlat;
	
	@Column (name="FMO_GL_OFFICE", length=5)
	private String FmOofGlOffice;
	
	@Column (name="FMO_NAMA_KOTA", length=100)
	private String FmOofNamaKota;
	
	@Column (name="FMO_BRANCH_NAME", length=100)
	private String FmOofBranchName;
	
	@Column (name="FMO_ZIP_CODE", length=5)
	private String FmOofZipCode;
	
	@Column (name="FMO_FLAG_SPECIAL_OFFICE", length=1)
	private String FmOofSpecOffice;
	
	@Column (name="FMO_COY_ID", length=5)
	private String FmOofCoyId;
	

}
