println("tomat")
println("MEGATOMAT")

val st = "aasssaa"

val folderString = st.foldLeft("") {(str, ch) =>
  if (str.lastOption == Option(ch))
    str.dropRight(1)
  else str+ch
}