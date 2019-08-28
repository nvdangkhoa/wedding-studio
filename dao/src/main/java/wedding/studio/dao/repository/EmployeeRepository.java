package wedding.studio.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wedding.studio.dao.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
