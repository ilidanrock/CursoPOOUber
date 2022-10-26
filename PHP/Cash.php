<?php
class Cash extends Payment{
  public $amount;

  public function __construct ($id, $amount){
    parent :: __construct($id);
    $this->amount = $amount;
  }
}
?>