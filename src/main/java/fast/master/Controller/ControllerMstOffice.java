package fast.master.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import fast.master.Models.MstOffice;
import fast.master.Services.ServMstOffice;


@RestController
public class ControllerMstOffice {
	@Autowired
	ServMstOffice serMstOff;
	
	@GetMapping("/getofficelist")
	public List<MstOffice> getOfficeList ()
	{
		return serMstOff.getOfficeList();
	}
		
	@GetMapping("/getofficename")
	public String getOffNameById (String offId)
	{
		return serMstOff.getOffNameById(offId);
	}


}
