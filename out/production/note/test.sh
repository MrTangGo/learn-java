#!/usr/bin/env bash

# 判断传过来的参数
if [ $# -lt 1 ] ; then
echo "require document name."
exit
fi

# 删除多余文件
rm -f *.aux
rm -f *.bbl
rm -f *.log
rm -f *.out
rm -f *.toc
rm -f *.blg
rm -f *.nav
rm -f *.snm
rm -f *.lot
rm -f *.lof

xelatex main.tex
bibtex main.aux
xelatex main.tex

# 删除多余文件
rm -f *.aux
rm -f *.bbl
rm -f *.log
rm -f *.out
rm -f *.toc
rm -f *.blg
rm -f *.nav
rm -f *.snm
rm -f *.lot
rm -f *.lof

echo OK.
clear
open -a preview main.pdf

exit 0
