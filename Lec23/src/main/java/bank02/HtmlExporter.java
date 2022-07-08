package bank02;

public class HtmlExporter implements Exporter {

	public String export(SummaryStatictics summaryStatictics) {
		String result ="<!DOCTYPE html>";
		result +="<html>";
		result +="<head>";
		result +="<meta charset='EUC-KR'>";
		result +="<title>Bank Transaction Report</title>";
		result +="</head>";
		result +="<body>";
		result +="<ul>";
		result +="<li><strong>The sum is </strong>:"+summaryStatictics.getSum()+"</li>";
		result +="<li><strong>The average is </strong>:"+summaryStatictics.getAverage()+"</li>";
		result +="<li><strong>The max is </strong>:"+summaryStatictics.getMax()+"</li>";
		result +="<li><strong>The min is </strong>:"+summaryStatictics.getMin()+"</li>";
		result +="</ul>";
		result +="</body>";
		result +="</html>";		
		return result;
	}

}
