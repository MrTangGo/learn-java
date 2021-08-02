# 设置预览模式，相当于 -pv 选项，在编译结束会开启预览
# $view 设置预览的文件格式
#$preview_mode = 1;
#$view = "pdf";

#连续编译模式
$preview_continuous_mode = 1;
$pdf_update_method = 0;

# 指定生成PDF文件的文件名，可以与LaTeX主文件名不一致
$jobname = "Learn Java for Myself";

# 设置pdf生成模式，有 0 1 2 3 4 5
# 0 代表不生成 pdf
# 1 代表使用 $pdfltex 选项的命令，在系统 RC 文件已经设置
# 2 代表使用 $ps2pdf；3 代表使用 $dvipdf；4 代表使用 $lualatex；
# 5 代表使用 $xelatex，在系统 RC 文件已经设置
$pdf_mode = 5;

# %O 代表选项，%S 代表对应命令的源文件
# -synctex=1 双向绑定
$xelatex = "xelatex -synctex=1 -interaction=nonstopmode -file-line-error %O %S";

# 删除文件的后缀名是：
$clean_ext = "synctex.gz acn acr xdv alg aux bbl bcf blg brf fdb_latexmk glg glo gls idx ilg ind ist lof log lot out run.xml toc dvi";

# 指定输出的路径
$out_dir = "temp";

# 用skim打开文件
$pdf_previewer = 'open -a Skim'






