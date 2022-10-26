<?php
class Card extends Payment{
  public $email ;
  public $amount;

  public function __construct ($id, $email , $amount){
    parent :: __construct($id);
    $this->email = $email;
    $this->amount = $amount;
  }
}
?>