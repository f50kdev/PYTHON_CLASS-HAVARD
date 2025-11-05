from copyreg import dispatch_table


def display_invoice(username, anount  , due_date):
  print(f"hello {username}")
  print(f"your bill of ${anount:.2f} is due : {due_date} ")

display_invoice("Faustino" , 40.32  , "02-11-22")

