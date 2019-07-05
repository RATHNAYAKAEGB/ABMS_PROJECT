package lk.abms.sl.abms_site_manager.service;

import lk.abms.sl.abms_site_manager.converter.ConverterDTO_ENTITY;
import lk.abms.sl.abms_site_manager.entity.WorkerCategory;
import lk.abms.sl.abms_site_manager.model.WorkerCategoryDTO;
import lk.abms.sl.abms_site_manager.repository.EmployeeCatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkerCategoryManagementService {
    @Autowired
    EmployeeCatagoryRepository employeeCatagoryRepository;



    public void CreateNewEmpCategory(WorkerCategoryDTO category) throws Exception{
        employeeCatagoryRepository.save(ConverterDTO_ENTITY.getEntity(category));
    }

    public void UpdateEmpCategory(WorkerCategory category) throws Exception{
        WorkerCategory cat = employeeCatagoryRepository.findByEmpCatId(category.getEmpCatId());
        cat.setCreateBy(category.getCreateBy());
        cat.setName(category.getName());
    }
    public List<WorkerCategory> findAllEmpCategory() throws Exception{
        return employeeCatagoryRepository.findAll();
    }

    public void deleteCategory(String catId) throws Exception{
        employeeCatagoryRepository.delete(employeeCatagoryRepository.findByEmpCatId(catId));
    }

}
