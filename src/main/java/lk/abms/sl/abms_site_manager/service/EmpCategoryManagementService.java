package lk.abms.sl.abms_site_manager.service;

import lk.abms.sl.abms_site_manager.entity.EmpCategory;
import lk.abms.sl.abms_site_manager.repository.EmployeeCatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpCategoryManagementService {
    @Autowired
    EmployeeCatagoryRepository employeeCatagoryRepository;



    public void CreateNewEmpCategory(EmpCategory category) throws Exception{
        employeeCatagoryRepository.save(category);
    }

    public void UpdateEmpCategory(EmpCategory category) throws Exception{
        EmpCategory cat = employeeCatagoryRepository.findByEmpCatId(category.getEmpCatId());
        cat.setCreateBy(category.getCreateBy());
        cat.setName(category.getName());
    }
    public List<EmpCategory> findAllEmpCategory(EmpCategory category) throws Exception{
        return employeeCatagoryRepository.findAll();
    }

    public void deleteCategory(String catId) throws Exception{
        employeeCatagoryRepository.delete(employeeCatagoryRepository.findByEmpCatId(catId));
    }

}
