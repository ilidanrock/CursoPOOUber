<?php
class Card extends Payment{
  public $numberCard ;
  public $cvv;
  public $expiration;
  public $amount;

  public function __construct ($id, $numberCard, $cvv ,$expiration, $amount){
    parent :: __construct($id);
    $this->numberCard = $numberCard;
    $this->cvv = $cvv;
    $this->expiration = $expiration;
    $this->amount = $amount;
  }
}
?>