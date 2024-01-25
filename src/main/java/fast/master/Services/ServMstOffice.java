package fast.master.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import fast.master.Models.MstOffice;
import fast.master.Repository.IMstOfficeRepository;


@Service
public class ServMstOffice {
	
	@Autowired
	IMstOfficeRepository repoOffices;
	
	public List<MstOffice> getOfficeList ()
	{
		return repoOffices.findAll();
	}
	
	public String getOffNameById (String offId)
	{
		return repoOffices.getOfficeName(offId);
	}

}
