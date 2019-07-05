package lk.abms.sl.abms_site_manager.controller;

import lk.abms.sl.abms_site_manager.entity.WorkerCategory;
import lk.abms.sl.abms_site_manager.model.WorkerCategoryDTO;
import lk.abms.sl.abms_site_manager.service.WorkerCategoryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/workerCategories")
public class WorkerCategoryController {

    @Autowired
    WorkerCategoryManagementService workerCategoryManagementService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String saveWorkerCategory(@RequestBody WorkerCategoryDTO workerCategoryDTO) throws Exception {
        workerCategoryManagementService.CreateNewEmpCategory(workerCategoryDTO);
        return workerCategoryDTO.getEmpCatId();
    }

    @GetMapping
    public ResponseEntity<List<WorkerCategory>> findAllWorkerCategory() throws Exception {
        List<WorkerCategory> workerCategories = workerCategoryManagementService.findAllEmpCategory();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count", workerCategories.size() + "");
        return new ResponseEntity<List<WorkerCategory>>(workerCategories, httpHeaders, HttpStatus.OK);
    }

}
