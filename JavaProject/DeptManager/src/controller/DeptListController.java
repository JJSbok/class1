package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import service.DeptListService;

// Controller Class 사용자의 요청을 처리할 Service를 결정하고 요청
// 요청의 결과를 받아서 사용자에게 결과를 보여주는 역할
public class DeptListController {

	DeptListService listService;

	public DeptListController() {
		this.listService = new DeptListService(new DeptDao());
	}

	public void getDeptList() {

		// 사용자의 요청 분석
		// 요청을 처리할 서비스를 이용해서 결과 데이터를 받는디.
		List<Dept> result = listService.getDeptList();
		printData(result);
		// 사용자에 응답할 포맷(템플릿, 뷰) 결정 >> 결과데이터를 전달(공유)

	}

	void printData(List<Dept> list) {
		System.out.println("부서 리스트 ===========");
		System.out.println("부서번호\t부서이름\t위치");
		System.out.println("====================");
		for (Dept d : list) {
			System.out.println(d.getDeptno() + "\t" + d.getDname() + "\t" + d.getLoc());
		}
	}
	
	public static void main(String[] args) {
		DeptListController listController = new DeptListController();
		
		listController.getDeptList();
	}
}
