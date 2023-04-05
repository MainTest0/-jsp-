package com.tenco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/uploadProc")
@MultipartConfig
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UploadController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파일 업로드 처리
		Part filePart = request.getPart("file");	// form name에서 선언한거
		System.out.println("파일확인 : " +filePart.getContentType());		// 마임타입
		System.out.println("파일사이즈확인(byte기반) : " +filePart.getSize());
		System.out.println("파일서브밋확인(사용자가 올린 파일이름) : " +filePart.getSubmittedFileName());
		
		// 스트림 준비
		InputStream fileContent = filePart.getInputStream();
		// 출력 스트림 준비 내 서버 컴퓨터에 파일 객체 만들어서 저장할 계획
		OutputStream outputStream = null;
		
		try {
			// 랜덤한 문자열 생성하기 (중복 파일 이름 방지)
			UUID uuid = UUID.randomUUID();
			System.out.println("uuid : " + uuid);
			// uuid : 590b8849-7c98-4ad5-bfc2-56925550ae0f
			String fileName = uuid+"_" + filePart.getSubmittedFileName();
			System.out.println("fileName : " + fileName);
			
			// 1단계 : 파일을 저장할 폴더를 미리 만들어두기
			// c드라이버에 jsp_upload파일 만들기
			
			File file = new File("C://jsp_upload/", fileName);
			
			// 파일 출력 스트림 생성
			outputStream = new FileOutputStream(file);
			
			// 입력 스트림에서 byte 단위로 읽어오면서 출력 스트림에 쓰기
			byte[] buffer = new byte[1024];
			int length;
			
			while( (length = fileContent.read(buffer)) != -1 ) {
				outputStream.write(buffer, 0, length);
			}
			System.out.println("File upload 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileContent.close();
			if(outputStream != null) {
				outputStream.flush();
				outputStream.close();
			}
			response.sendRedirect("/demo11");
		}
		
	}

}
