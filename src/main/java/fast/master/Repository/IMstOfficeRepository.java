package fast.master.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fast.master.Models.MstOffice;


@Repository

public interface IMstOfficeRepository extends JpaRepository<MstOffice, String>{
	
	@Query ("select s.FmOofNameShort from MstOffice s where s.FmOofCode=?1 ")
	public String getOfficeName (String offCode);
	

}
