
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/pattern")
public class PatternController {

	@Autowired
	private ListUserService listUserService;
	@Autowired
	private SaveUserService saveUserService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Object listUserService() {
		return new ResponseEntity<Object>(listUserService.execute(), HttpStatus.OK);
	}

	@RequestMapping(value = "/save", method =  RequestMethod.POST)
	public Object saveLocation(HttpServletRequest request, @Validated @RequestBody UserSaveDTO dto) {
		return new ResponseEntity<Object>(saveUserService.execute(dto), HttpStatus.OK);
	}
	
}
