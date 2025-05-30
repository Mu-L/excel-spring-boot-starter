package com.pig4cloud.plugin.excel.enhance;

import cn.idev.excel.write.builder.ExcelWriterBuilder;
import cn.idev.excel.write.builder.ExcelWriterSheetBuilder;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import com.pig4cloud.plugin.excel.head.HeadGenerator;
import jakarta.servlet.http.HttpServletResponse;

/**
 * ExcelWriterBuilder 增强
 *
 * @author Hccake 2020/12/18
 * @version 1.0
 */
public interface WriterBuilderEnhancer {

	/**
	 * ExcelWriterBuilder 增强
	 * @param writerBuilder ExcelWriterBuilder
	 * @param response HttpServletResponse
	 * @param responseExcel ResponseExcel
	 * @param templatePath 模板地址
	 * @return ExcelWriterBuilder
	 */
	ExcelWriterBuilder enhanceExcel(ExcelWriterBuilder writerBuilder, HttpServletResponse response,
			ResponseExcel responseExcel, String templatePath);

	/**
	 * ExcelWriterSheetBuilder 增强
	 * @param writerSheetBuilder ExcelWriterSheetBuilder
	 * @param sheetNo sheet角标
	 * @param sheetName sheet名，有模板时为空
	 * @param dataClass 当前写入的数据所属类
	 * @param template 模板文件
	 * @param headEnhancerClass 当前指定的自定义头处理器
	 * @return ExcelWriterSheetBuilder
	 */
	ExcelWriterSheetBuilder enhanceSheet(ExcelWriterSheetBuilder writerSheetBuilder, Integer sheetNo, String sheetName,
			Class<?> dataClass, String template, Class<? extends HeadGenerator> headEnhancerClass);

}
